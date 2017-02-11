# cloj-env-test

A Clojure *web application* that prinst the host's environment variables. Used as a proof-of-concept application
for Docker deployments.

## Running

The built image can be run with Docker like so:

```sh
docker run -p 8011:80 -v $(pwd):/app cloj-env-test-dev
```

Make sure `docker run` is issued in the project's directory. Replace `cloj-env-test-dev` with the image name
built using `Dockerfile.dev`

## Deploying

When run in production, build an image using the `Dockerfile` and translate a host port to port `80` in the container.
