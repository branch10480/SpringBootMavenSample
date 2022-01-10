package com.example.springbootmavensample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// @~はアノテーション（注釈）プログラムに関する補足情報を提供します
// このクラスがコントローラーであることを示します
@Controller
// @RequestMappingはクラスにも指定できる
// この場合、http://localhost:8080/top/confirm などとなる
@RequestMapping("/top")   // クラスレベルでの指定
public class HelloController {

  // HTTPリクエストを受け付ける
  // 引数に "/" を指定したので http://localhost:8080/ でアクセス可能
  @RequestMapping("/")    // メソッドレベルでの指定
  public String index() {
    // hello.htmlを呼び出します
    // templatesフォルダの hello.html を呼び出せます
    return "hello";
  }

  // HTTPのGETリクエストを受け付けます
  @GetMapping("/greeting")
  public String greeting(@RequestParam(required = false) String message, Model model) {
    // Thymeleafへ取得した値を渡すにはModelへ値を追加します
    model.addAttribute("sample", message);
    return "hello";
  }

  @RequestMapping("/form")
  public String form() {
    return "form";
  }

  @PostMapping("/confirm")
  public String confirm(@RequestParam String message, Model model) {
    model.addAttribute("message", message);
    return "confirm";
  }
}

/*
パッケージ名はすべて小文字で記載
DTO -> dto, myApp -> myapp  ...etc
 */

/*
Thymeleaf（タイムリーフ）はSpring Bootで推奨されているテンプレートエンジン
昔はJSP（JavaServer Pages）が主流でしたが、今は非推奨。
JSPを知っている場合であってもThymeleafを使います。
 */

/*
@RequestParamには引数を渡すことができる
ちなみにrequiredは指定しなければtrue

e.g.)
@RequestParam("message")
@RequestParam(name = "message")
@RequestParam(defaultValue = "Hi!")
 */