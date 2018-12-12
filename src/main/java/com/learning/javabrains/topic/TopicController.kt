package com.learning.javabrains.topic

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
class TopicController{

    @Autowired
    private val topicService:TopicService? = null

    @RequestMapping("/topics")
    fun getAllTopic():List<Topic>{
        return topicService!!.allTopics
    }

    @RequestMapping("/topics/{id}")
    fun getTopic(@PathVariable id:String):Topic{

        return topicService!!.getTopic(id)
    }

    @RequestMapping(method = [RequestMethod.POST],value = ["/topics"])
    fun addTopic(@RequestBody topic: Topic){
        topicService!!.addTopic(topic)
    }

    @RequestMapping(method = [RequestMethod.PUT],value = ["/topics/{id}"])
    fun updateTopic(@RequestBody topic: Topic,@PathVariable id: String){
        topicService!!.updateTopic(topic,id)
    }

    @RequestMapping(method = [RequestMethod.DELETE],value = ["/topics/{id}"])
    fun deleteTopic(@PathVariable id: String){
        return topicService!!.deleteTopic(id)
    }
}