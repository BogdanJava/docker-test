package by.bogdan.dockerproject.repository

import by.bogdan.dockerproject.model.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository : MongoRepository<User, Long>