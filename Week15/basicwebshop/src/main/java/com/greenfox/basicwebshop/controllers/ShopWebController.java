package com.greenfox.basicwebshop.controllers;

import com.greenfox.basicwebshop.models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class ShopWebController {
    private final List<ShopItem> shopItems = new ArrayList<>();

    public ShopWebController() {
        shopItems.add(new ShopItem("Running hoes", "Nike running shoes for every day sport", 1000.0, 5, "clothesShoes"));
        shopItems.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2, "electro"));
        shopItems.add(new ShopItem("Coca cola", "0.5l standard coke", 25.0, 0, "beveragesSnacks"));
        shopItems.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100, "beveragesSnacks"));
        shopItems.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300.0, 1, "clothesShoes"));
    }

    @GetMapping("/list")
    public String listAllItems(Model model) {
        model.addAttribute("shopItems", shopItems);
        return "index";
    }

    @GetMapping("/more-filters")
    public String listAllItems2(Model model) {
        model.addAttribute("shopItems", shopItems);
        return "index2";
    }

    @PostMapping("/search")
    public String searching(Model model, @RequestParam String product) {
        List<ShopItem> searchedItemDescription = shopItems.stream()
                .filter(shopItem -> shopItem.getDescription().contains(product))
                .collect(Collectors.toList());
        List<ShopItem> searchedItemName = shopItems.stream()
                .filter(shopItem -> shopItem.getName().contains(product))
                .collect(Collectors.toList());

        List<ShopItem> searchedItem = new ArrayList<>();
        Stream.of(searchedItemDescription).forEach(searchedItem::addAll);
        Stream.of(searchedItemName).forEach(searchedItem::addAll);

        model.addAttribute("shopItems", searchedItem);
        return "index";
    }

    @GetMapping("/only-available")
    public String onlyAvailable(Model model) {

        model.addAttribute("shopItems", shopItems.stream()
                .filter(i -> i.getQuantityStock() > 0)
                .collect(Collectors.toList()));
        return "index";
    }

    @GetMapping("/cheapest-first")
    public String cheapestFirst(Model model) {
        model.addAttribute("shopItems", shopItems.stream()
                .sorted(Comparator.comparing(ShopItem::getPrice))
                .collect(Collectors.toList()));
        return "index";
    }

    @GetMapping("/contains-Nike")
    public String containsNike(Model model) {

        List<ShopItem> containsDescription = shopItems.stream()
                .filter(i -> i.getDescription().contains("Nike"))
                .collect(Collectors.toList());

        List<ShopItem> containsName = shopItems.stream()
                .filter(i -> i.getName().contains("Nike"))
                .collect(Collectors.toList());

        List<ShopItem> containsAll = new ArrayList<>();
        Stream.of(containsDescription).forEach(containsAll::addAll);
        Stream.of(containsName).forEach(containsAll::addAll);

        model.addAttribute("shopItems", containsAll);
        return "index";
    }

    @GetMapping("/average-stock")
    public String averageStock(Model model) {
        DecimalFormat formatter = new DecimalFormat("#.##");

        var averageStockResult =
                shopItems.stream()
                        .filter(shopItem -> shopItem.getQuantityStock() > 0)
                        .map(ShopItem::getQuantityStock).reduce(0, Integer::sum);

        model.addAttribute("averageStock", formatter.format((double) averageStockResult / shopItems.size()));
        return "average-stock";
    }

    @GetMapping("/most-expensive-available")
    public String mostExpensiveAvailable(Model model) {
        model.addAttribute("shopItems", shopItems.stream()
                .sorted(Comparator.comparing(ShopItem::getPrice).reversed())
                .filter(shopItem -> shopItem.getQuantityStock() > 0)
                .collect(Collectors.toList()));
        return "index";
    }

    @GetMapping("/{searchString}")
    public String filterClothes(@PathVariable(name = "searchString") String typeProduct, Model model) {

        model.addAttribute("shopItems", shopItems.stream()
                .filter(shopItem -> shopItem.getType().equals("typeProduct"))
                .collect(Collectors.toList()));
        return "index";
    }

    @GetMapping("/filter-clothes-shoes")
    public String filterClotehsShoes(Model model) {
        model.addAttribute("shopItems", shopItems.stream()
                .filter(shopItem -> shopItem.getType().contains("clothesShoes"))
                .collect(Collectors.toList()));
        return "index2";
    }

    @GetMapping("/filter-electro")
    public String filterElectro(Model model) {
        model.addAttribute("shopItems", shopItems.stream()
                .filter(shopItem -> shopItem.getType().contains("electro"))
                .collect(Collectors.toList()));
        return "index2";
    }

    @GetMapping("/filter-beverages-snacks")
    public String filterbeveragesSnacks(Model model) {
        model.addAttribute("shopItems", shopItems.stream()
                .filter(shopItem -> shopItem.getType().contains("beveragesSnacks"))
                .collect(Collectors.toList()));
        return "index2";
    }

    @PostMapping("/filter-price")
    public String filterPrice(Model model, @RequestParam Integer price) {
        model.addAttribute("shopItems", shopItems.stream()
                .filter(shopItem -> shopItem.getPrice().equals(Double.parseDouble(String.valueOf(price))))
                .collect(Collectors.toList()));
        return "index2";
    }

    @GetMapping("/above-price")
    public String abovePrice(Model model, Integer price) {
        model.addAttribute("shopItems", shopItems.stream().filter(shopItem -> shopItem.getPrice() > price)
                .collect(Collectors.toList()));
        return "index2";
    }

//    Unfortunately exchange to Euro and few others not done yet

}
