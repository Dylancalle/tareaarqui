package com.ucb.FrankyService;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("*/workflow")
public class WorkflowController {
    WorkflowService workflowService;

    @GetMapping
    public List list() {
        return workflowService.obtainList();
    }


    @PostMapping
    public void save(
            @RequestBody WorkflowDto workflowDto
    ) {
        Workflow workflow = new Workflow(
                workflowDto.name(),
                workflowDto.description()
        );
        this.workflowService.create(workflow);
    }

}
