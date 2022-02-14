package com.example.demo.controller.bank10;

import com.example.demo.entity.bank10.Product;
import com.example.demo.service.bank10.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/bank10/product")
public class ProductController {

    // * 상품 등록
    // * 상품 삭제
    // * 상품 리스트
    // * 상품 수정
    // * 상품 상세보기

    // 먼저 상품 리스트 구현 ! --> db 상의 table 추가 필요할것 .. 상품 리스트에는 상품 이름, 가격만
    // 상품 상세보기에 상품 이름 가격 설명 등..

    @Autowired
    private ProductService productService;

    @GetMapping("/register")
    public String registerForm (Product product) {

        log.info("register Form");

        return "/bank10/product/register";
    }

    @PostMapping("/register")
    public String register (Product product, Model model){
        log.info("DB register - board 정보: " + product);

        productService.register(product);

        return "/bank10/product/success";
    }

    @GetMapping("/list")
    public String list (Model model){

        log.info("Product list");

        model.addAttribute("list", productService.list());

        return "/bank10/product/list";
    }

    @GetMapping("/detail")
    public String read (int productNo, Model model){
        log.info("detail");

        model.addAttribute(productService.detail(productNo));

        return "/bank10/product/detail";
    }

    @GetMapping("modify")
    public String modifyForm (int productNo, Model model){
        log.info("modifyForm");

        model.addAttribute(productService.detail(productNo));

        return "/bank10/product/modify";
    }

    @PostMapping("/modify")
    public String modify (Product product, Model model) {
        log.info("modify");

        productService.modify(product);

        return "/bank10/product/success";
    }

    @PostMapping("/remove")
    public String remove (int productNo, Model model) {
        log.info("remove");

        productService.remove(productNo);

        return "/bank10/product/success";
    }

}
