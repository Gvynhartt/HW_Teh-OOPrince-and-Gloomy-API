package ru.netology.oop;

public class Main {
    public static void main(String[] args) {
        Post serverRequest = new Post();

            serverRequest.birthday.day = 29;
            serverRequest.birthday.month = 2;
            serverRequest.birthday.year = 1964;

            serverRequest.name = "Киктор";
            serverRequest.passport = "1138 № 19842077";
            serverRequest.patronymic = "Сербович";
            serverRequest.phone = "8 (800) 555-35-35";
            serverRequest.surname = "Вислый";
            serverRequest.subscription = true;
    }
}