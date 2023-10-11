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

    // Menu - Add Operation
    public void addMenu() {
        System.out.println("**********************************");
        System.out.println("**      1 Add a new record      **");
        System.out.println("**      2 View all records      **");
        System.out.println("**      3 Return to previous    **");
        System.out.println("**********************************");
    }

    // Menu - Search Operation
    public void searchMenu() {
        System.out.println("**********************************");
        System.out.println("**      1 Search by name        **");
        System.out.println("**      2 Search by age         **");
        System.out.println("**      3 Search by gender      **");
        System.out.println("**      4 Search by number      **");
        System.out.println("**      5 Search by address     **");
        System.out.println("**      6 View all records      **");
        System.out.println("**      7 Return to previous    **");
        System.out.println("**********************************");
    }

    // Menu - Modify Operation
    public void modifyMenu() {
        System.out.println("******************************************");
        System.out.println("**      1 View all records              **");
        System.out.println("**      2 Modify specified record       **");
        System.out.println("**      3 Return to previous            **");
        System.out.println("******************************************");
    }

    // Sub-menu - Modify Operation
    public void subModifyMenu() {
        System.out.println("**********************************");
        System.out.println("**      1 Modify name           **");
        System.out.println("**      2 Modify age            **");
        System.out.println("**      3 Modify gender         **");
        System.out.println("**      4 Modify number         **");
        System.out.println("**      5 Modify address        **");
        System.out.println("**      6 Return to previous    **");
        System.out.println("**********************************");
    }

    // Menu - Delete Operation
    public void deleteMenu() {
        System.out.println("******************************************");
        System.out.println("**      1 View all records              **");
        System.out.println("**      2 Delete specified record       **");
        System.out.println("**      3 Delete all records            **");
        System.out.println("**      4 Return to previous            **");
        System.out.println("******************************************");
    }

    // Menu - Sort Operation
    public void sortMenu() {
        System.out.println("**********************************");
        System.out.println("**      1 Sort by name          **");
        System.out.println("**      2 Sort by age           **");
        System.out.println("**      3 Sort by gender        **");
        System.out.println("**      4 View all records      **");
        System.out.println("**      5 Return to previous    **");
        System.out.println("**********************************");
    }

}
