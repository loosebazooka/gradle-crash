package org.myorg;

import org.gradle.api.DefaultTask;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.TaskAction;

public abstract class CrashTask extends DefaultTask {

  // some combo of this customData type and outputdirectory causes a crash
  @OutputDirectory
  @Optional
  abstract DirectoryProperty getOutputDir();
  @Input
  abstract Property<CustomData> getCustomData();

  @TaskAction
  public void doCrash() throws Exception {
    System.out.println("I will now crash the gradle daemon");
    System.out.println(getCustomData().get().getVcsUrl().get());
  }
}