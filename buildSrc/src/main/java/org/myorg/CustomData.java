package org.myorg;

import org.gradle.api.provider.Property;

public interface CustomData {
    Property<String> getWebsiteUrl();
    Property<String> getVcsUrl();
}
