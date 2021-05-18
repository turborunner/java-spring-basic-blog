package com.pluralsight.blog;

import com.pluralsight.blog.data.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pluralsight.blog.data.PostRepository;

@Controller
public class BlogController {
    PostRepository postRepository = new PostRepository();

    public class PostRepository {
        PostRepository a = postRepository;
    }

    @RequestMapping("/")
    public String listPosts(ModelMap modelMap){
        modelMap.put("title", "Blog Post 1");
        return "home";
    }
}
