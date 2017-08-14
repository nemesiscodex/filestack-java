package com.filestack.model.transform.tasks.filters;

import com.filestack.model.transform.base.ImageTransformTask;

public class NegativeTask extends ImageTransformTask {

  // Constructor left public because this task can be used with default options
  // Builder doesn't make sense for this task
  public NegativeTask() {
    super("negative");
  }
}