@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.twofasAndroidLibrary)
}

android {
    namespace = "com.twofasapp.backup.domain"
}

dependencies {
    implementation(project(":base"))
    implementation(project(":core:di"))
    implementation(project(":extensions"))
}
