dependencies {
    "testImplementation"("org.junit.jupiter:junit-jupiter-api:6.1.3")
    "testRuntimeOnly"("org.junit.jupiter:junit-jupiter-engine:6.1.3")
    "testImplementation"("org.junit.jupiter:junit-jupiter-params:6.1.3")
    "testImplementation"("org.junit.platform:junit-platform-launcher:6.1.3")
    "testImplementation"("com.willowtreeapps.assertk:assertk-jvm:0.28.1")
}

tasks.withType<Test> {
    useJUnitPlatform { }
}