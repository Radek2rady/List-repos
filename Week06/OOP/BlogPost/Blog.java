package OOP.BlogPost;

import java.util.ArrayList;
import java.util.List;

public class Blog {
   List<BlogPost> blogies;

   public Blog() {
       this.blogies = new ArrayList<>();
   }

   public void add(BlogPost blog) {
       blogies.add(blog);
   }

   public void delete(int index) {
       for (int i = 0; i < blogies.size(); i++) {
           blogies.remove(index);
       }
   }

   public void update(int index, BlogPost blog) {
       for (int i = 0; i < blogies.size(); i++) {
           blogies.remove(index);
           blogies.add(index,blog);
       }
   }

}
