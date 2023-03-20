package org.myorg;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class SitePlugin implements Plugin<Project> {
    public void apply(Project project) {
        var ext = project.getExtensions().create("site", SiteExtension.class);
        project.getTasks().register(
            "crashTask",
            CrashTask.class,
            t -> t.getCustomData().set(ext.getCustomData()));
    }

}
