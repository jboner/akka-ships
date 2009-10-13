#!/bin/sh
echo "Deploying ./target/ships-0.1.jar to AKKA_HOME/deploy"
cp ./target/ships-0.1.jar $AKKA_HOME/deploy