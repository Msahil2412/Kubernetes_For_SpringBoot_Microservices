package com.asknet.accounts.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsControllers {

        @GetMapping("/accounts")
     public String getAllAccounts() {
         return "HEY!...";
     }
}
