package by.bogdan.dockerproject.service

import by.bogdan.dockerproject.model.User
import by.bogdan.dockerproject.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class MongoService(private val userRepository: UserRepository) {
    fun getUsers(): List<User> = userRepository.findAll()
}