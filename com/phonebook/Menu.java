package com.phonebook;
/**
 * Generate the whole menu
 */
public class Menu {

    // Menu - Main
    public void mainMenu() {
        System.out.println("**********************");
        System.out.println("**     1 Add        **");
        System.out.println("**     2 Search     **");
        System.out.println("**     3 Modify     **");
        System.out.println("**     4 Delete     **");
        System.out.println("**     5 Sort       **");
        System.out.println("**     6 Exit       **");
        System.out.println("**********************");
    }

    // Menu - Add
    public void addMenu() {
        System.out.println("**********************************");
        System.out.println("**      1 Add a new record      **");
        System.out.println("**      2 View all records      **");
        System.out.println("**      3 Return to Main Menu   **");
    }

    // Menu - Search
    public void searchMenu() {

    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mainMenu();
    }
}
