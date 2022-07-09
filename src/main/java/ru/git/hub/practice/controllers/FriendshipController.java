package ru.git.hub.practice.controllers;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class FriendshipController {

    private final Scanner scanner;

    public String letsBeFriends(){
        return "Let's be friends";
    }
}
