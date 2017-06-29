package by.malinovski.library.interfaces;


import by.malinovski.library.objects.User;

public interface SecureLibrary {

    boolean login(User user);

    void logout(User user);

}
