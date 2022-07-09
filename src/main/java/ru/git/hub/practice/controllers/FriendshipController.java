package ru.git.hub.practice.controllers;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class FriendshipController {

    private final Scanner scanner;

    public String letsBeFriends(){
        return "Let's be friends";
    }

    public String approval(){
        System.out.println("Do you really wont to be friends?\n1 - Yes, \n2 - No");
        int answer = scanner.nextInt();
        if(answer == 1){
            return "Super!";
        } else if(answer == 2){
            return "I'm laught at it";
        } else{
            return "wrong command";
        }
    }
}
