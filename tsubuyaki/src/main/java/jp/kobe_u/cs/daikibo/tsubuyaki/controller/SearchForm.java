package jp.kobe_u.cs.daikibo.tsubuyaki.controller;

import lombok.Data;

@Data
public class SearchForm {
 
    String name; //投稿者
  
    String word; //つぶやき（省略不可）
 
}
