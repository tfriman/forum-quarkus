#!/usr/bin/env bash

. ./demo-magic.sh

clear

p "mvn clean package -Pnative -Dnative-image.docker-build=true -DskipTests=true"

pe "oc new-project forum-quarkus --display-name="ForumQuarkus""
pe "oc new-build quay.io/redhat/ubi-quarkus-native-runner --binary --name=forum-quarkus -l app=forum-quarkus"
pe "oc start-build forum-quarkus --from-file=target/quarkus-forum-1.0-SNAPSHOT-runner --follow"
pe "oc new-app forum-quarkus"
pe "oc expose service forum-quarkus"
pe "oc set resources dc/forum-quarkus --limits=memory=50Mi "
pe "oc scale --replicas=10 dc/forum-quarkus"
