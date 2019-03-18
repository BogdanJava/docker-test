FROM mongo:3.4
WORKDIR /container
COPY init.json ./init.json
CMD mongoimport --host mongo --db ip-app --collection users --type json --file ./init.json --jsonArray