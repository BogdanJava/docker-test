package by.bogdan.dockerproject.model

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "users")
data class User(val id: Long,
                val name: String,
                val birthday: Date)