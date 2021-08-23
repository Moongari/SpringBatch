package com.moonSpringbatch.HelloWorld;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class HelloWorldTasklet implements Tasklet {

    private String name;

    public HelloWorldTasklet(final String name) {
        super();
        this.name = name;
    }

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        System.out.println("hello Moon Tasklet..."+ name);
        return RepeatStatus.FINISHED;
    }
}
