plugins {
	alias(libs.plugins.androidApplication) apply false
	alias(libs.plugins.kotlinAndroid) apply false
	alias(libs.plugins.owasp.dependency.check)
	alias(libs.plugins.androidLibrary) apply false
}
