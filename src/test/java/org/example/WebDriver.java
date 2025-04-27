package org.example;

import jdk.internal.net.http.common.SubscriptionBase;

import java.nio.file.attribute.FileTime;

public interface WebDriver {

    FileTime navigate();

    SubscriptionBase manage();
}
