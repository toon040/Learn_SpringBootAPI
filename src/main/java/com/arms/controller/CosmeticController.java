package com.arms.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CosmeticController {
    List<Cosmetic> cosmetic = new ArrayList<>(Arrays.asList(new Cosmetic("LIP001", "XOXO Lipstick", 1), new Cosmetic("BRO001", "NYX Brush On Palette", 1) ));

    @RequestMapping("/cosmetics")
    public List<Cosmetic> getAllCosmetics() {
        return cosmetics;
    }
}