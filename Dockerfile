FROM clojure:alpine

RUN mkdir /app
WORKDIR /app
ADD ["project.clj", "project.clj"]
ADD ["src", "src"]

RUN lein uberjar && \
    mv target/cloj-env-test.jar .

EXPOSE 80
CMD ["java", "-jar", "cloj-env-test.jar"]
