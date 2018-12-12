package com.learning.javabrains.topic;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("java", "Core java", " Core Java Description"),
            new Topic("javascript", "Javascript", "Javascript Description")));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> Objects.equals(t.getId(), id)).findFirst().get();
    }

    public void addTopic(@NotNull Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(@NotNull Topic topic, String id) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if (Objects.equals(t.getId(), id)) {
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(@NotNull String id) {
        topics.removeIf(t-> Objects.equals(t.getId(), id));
    }
}
