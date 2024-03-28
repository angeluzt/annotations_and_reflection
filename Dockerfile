#FROM jenkins/agent:alpine-jdk11

# Switch to root user
#USER root

# Install necessary packages
#RUN apk update && \
#    apk add --no-cache \
#        gradle \
#        curl \
#    && rm -rf /var/cache/apk/*

# Verify installation
#RUN java -version && \
#    gradle --version
FROM amazoncorretto:11
WORKDIR /app
COPY ./build/libs/annotations_and_reflection-all-0.0.1-SNAPSHOT.jar .
EXPOSE 8081
CMD ["java", "-jar", "annotations_and_reflection-all-0.0.1-SNAPSHOT.jar"]