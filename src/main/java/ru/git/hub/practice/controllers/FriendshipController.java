package ru.git.hub.practice.controllers;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class FriendshipController {

    private final Scanner scanner = new Scanner(System.in);

    public String letsBeFriends(){
        return "Let's be friends";
    }

    public String approval(){
        System.out.println("Do you really wont to be friends?\n0 - Yes, \n1 - No");
        int answer = scanner.nextInt();
        if(answer == 0){
            return "Super!";
        } else if(answer == 1){
            return "I'm laugh at it";
        } else{
            return "wrong command";
        }
    }
}
