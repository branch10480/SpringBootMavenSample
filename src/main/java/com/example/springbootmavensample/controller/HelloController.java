package com.example.springbootmavensample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// @~はアノテーション（注釈）プログラムに関する補足情報を提供します
// このクラスがコントローラーであることを示します
@Controller
public class HelloController {

    // HTTPリクエストを受け付ける
    // 引数に "/" を指定したので http://localhost:8080/ でアクセス可能
    @RequestMapping("/")
    public String index() {
        // hello.htmlを呼び出します
        // templatesフォルダの hello.html を呼び出せます
        return "hello";
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
