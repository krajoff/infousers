package ru.example.infousers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.example.infousers.model.User;
import ru.example.infousers.repository.UserRepository;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, User user) {
        // мы должны сначала проверить, существует ли заметка с данным ID
        User existingUser = getUserById(id);
        // обновляем поля существующей заметки
        existingUser.setAge(user.getAge());
        existingUser.setEmail(user.getEmail());
        // сохраняем и возвращаем обновленную заметку
        return userRepository.save(existingUser);
    }

    @Override
    public void deleteUser(Long id) {
        // проверяем, существует ли заметка с данным ID
        getUserById(id);
        // если да, то удаляем ее
        userRepository.deleteById(id);
    }
}
