commercebuild install
mvn clean install -DskipTests -Dmaven.javadoc.skip=true -Dcheckstyle.skip=true
commercebuild deploy
mvn deploy -B -DskipTests -Dmaven.javadoc.skip=true -Dcheckstyle.skip=true


[![Build Status](https://github.com/firebase/firebase-admin-java/workflows/Continuous%20Integration/badge.svg)](https://github.com/firebase/firebase-admin-java/actions)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.google.firebase/firebase-admin/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.google.firebase/firebase-admin)
[![Javadoc](https://javadoc-badge.appspot.com/com.google.firebase/firebase-admin.svg)](https://firebase.google.com/docs/reference/admin/java/reference/packages)

# Firebase Admin Java SDK

## Table of Contents

 * [Overview](#overview)
 * [Installing](#installing)
 * [Contributing](#contributing)
 * [Supported Java Versions](#supported-java-versions)
 * [Documentation](#documentation)
 * [License and Terms](#license-and-terms)


## Overview

[Firebase](https://firebase.google.com) provides the tools and infrastructure
you need to develop apps, grow your user base, and earn money. The Firebase
Admin Java SDK enables access to Firebase services from privileged environments
(such as servers or cloud) in Java. Currently this SDK provides
Firebase custom authentication support, and Firebase realtime database access.

For more information, visit the
[Firebase Admin SDK setup guide](https://firebase.google.com/docs/admin/setup/).


## Installing

Firebase Admin Java SDK is distributed via the
[Maven central repository](https://repo1.maven.org/maven2/com/google/firebase/firebase-admin/).
Simply configure your build tool to pull the latest version of the SDK into
your projects.

 * Group ID: `com.google.firebase`
 * Artifact ID: `firebase-admin`


## Contributing

Please refer to the [CONTRIBUTING page](./CONTRIBUTING.md) for more information
about how you can contribute to this project. We welcome bug reports, feature
requests, code review feedback, and also pull requests. 


## Supported Java Versions

We currently support Java 8 and higher. The Firebase Admin Java SDK also runs on [Google App
Engine](https://cloud.google.com/appengine/).

The Firebase Admin Java SDK follows the [Oracle Java SE
support roadmap](https://www.oracle.com/java/technologies/java-se-support-roadmap.html) 
(see the Oracle Java SE Product Releases section).

### For new development

In general, new feature development occurs with support for the lowest Java LTS version
covered by Oracle's Premier Support (which typically lasts 5 years from initial General
Availability). If the minimum required JVM for a given library is changed, it is
accompanied by a [semver](https://semver.org/) major release.

Java 11 and Java 17 are the best choices for new development.

## Documentation

* [Setup Guide](https://firebase.google.com/docs/admin/setup/)
* [Database Guide](https://firebase.google.com/docs/database/admin/start/)
* [API Reference](https://firebase.google.com/docs/reference/admin/java/reference/packages)


## License and Terms

Firebase Admin Java SDK is licensed under the
[Apache License, version 2.0](http://www.apache.org/licenses/LICENSE-2.0).

Your use of Firebase is governed by the
[Terms of Service for Firebase Services](https://firebase.google.com/terms/).

