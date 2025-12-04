package com.Marvellous.Marvellous_FullStack.Repositroy;

import com.Marvellous.Marvellous_FullStack.Entity.BatchEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BatchEntryRepository extends MongoRepository<BatchEntry, ObjectId>
{

}
