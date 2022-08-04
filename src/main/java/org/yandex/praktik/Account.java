package org.yandex.praktik;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if(!checkNameLength(name)) {
            return false;
        } else if(!checkSpaceInName(name)) {
            return false;
        } else {
            return true;
        }
    }

    private boolean checkNameLength(String name) {
        if(name.length() <= 3){
            return false;
        } else if (name.length() > 19) {
            return false;
        }
        return true;
    }

    private boolean checkSpaceInName(String name) {
        return name.matches("[a-zA-Zа-яА-Я]+\\s[a-zA-Zа-яА-Я]+");
    }

}
