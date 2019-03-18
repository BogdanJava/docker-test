package by.bogdan.dockerproject.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "users")
data class User(@Id val _id: ObjectId,
                val id: Long,
                val name: String,
                val birthday: Date)