// package site.metacoding.second.web;

// import java.util.ArrayList;
// import java.util.List;

// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;

// import site.metacoding.second.domain.Post;

// // View(글쓰기 페이지, 글 목록 페이지, 글 상세보기 페이지)
// @Controller
// public class PostController2{
// @GetMapping("/post/writeForm")
// public String writeForm2() {
// return "post/writeForm";
// }

// @GetMapping("/post/list")
// public String list2(Model model) {
// Post post111 = new Post(1, "제목1", "내용1");
// Post post222 = new Post(2, "제목2", "내용2");
// Post post333 = new Post(3, "제목3", "내용3");
// Post post444 = new Post(4, "제목4", "내용4");
// Post post555 = new Post(5, "제목5", "내용5");
// List<Post>posts = new ArrayList<>();
// posts.add(post111);
// posts.add(post222);
// posts.add(post333);
// posts.add(post444);
// posts.add(post555);

// model.addAttribute("posts", posts);
// return "post/list";
// }

// @GetMapping("/post/detail2")
// public String detail2(Model model){
// // 1. DB에 연결해서 SELECT해야함.
// // 2. ResultSet을 JavaObject로 변경
// Post post = new Post(1, "제목1", "내용1");
// // 3. request에 담기
// model.addAttribute("post", post);

// return "post/detail2"; // RequestDispatcher로 forward함 = request가 복제됨.
// }
// }