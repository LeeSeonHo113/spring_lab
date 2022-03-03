// package site.metacoding.second.web;

// import java.util.ArrayList;
// import java.util.List;

// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;

// import site.metacoding.second.domain.Post;

// // View(글쓰기 페이지, 글 목록 페이지, 글 상세보기 페이지)
// @Controller
// public class PostController3{
// @GetMapping("/post/writeForm")
// public String writeForm3() {
// return "post/writeForm";
// }

// @GetMapping("post/list")
// public String list3(Model model){
// Post post1111 = new Post(1, "제목1", "내용1");
// Post post2222 = new Post(2, "제목2", "내용2");
// Post post3333 = new Post(3, "제목3", "내용3");
// Post post4444 = new Post(4, "제목4", "내용4");
// Post post5555 = new Post(5, "제목5", "내용5");
// List<Post>posts = new ArrayList<>();
// posts.add(post1111);
// posts.add(post2222);
// posts.add(post3333);
// posts.add(post4444);
// posts.add(post5555);

// model.addAttribute("posts", posts);
// return "post/list";
// }

// @GetMapping("/post/detail3")
// public String detail3(Model model){
// // 1. DB에 연결해서 SELECT해야함.
// // 2. ResultSet을 JavaObject로 변경
// Post post = new Post(1, "제목1", "내용1");
// // 3. request에 담기
// model.addAttribute("post", post);

// return "post/detail3"; // RequestDispatcher로 forward함 = request가 복제됨.
// }
// }