# PunkApi4J
> Java / Spring Boot Wrapper for PunkApi (https://punkapi.com)
<p align="center">
  <a href="">
    <img src="https://img.shields.io/travis/dbader/node-datadog-metrics/master.svg?style=flat-square" />
  </a>
  <a href="https://github.com/mGungorr/PunkApi4J/blob/master/LICENSE">
    <img alt="License: MIT" src="https://img.shields.io/badge/license-MIT-yellow.svg" target="_blank" />
  </a>
  <a href="">
    <img src="https://codecov.io/gh/kefranabg/readme-md-generator/branch/master/graph/badge.svg" />
  </a>
</p>

## 📋 Table of contents <a id="table-of-contents"></a>

- [📥 Installation](#installation)
- [🚀 Usage](#usage)
- [⚙️ API Example](#contribute)
- [🤝 Contributing](#license)
- [⌨️ Author](#footer)
- [📝 License](#license)

## 📥 Installation

Clone the repo

```sh
git clone https://github.com/mGungorr/PunkApi4J
```

On a separate terminal and since this is a maven project you just need to go to the root of the project and perform the command:
```
mvn clean install
```
or if you don't have installed maven on your OS

```
mvnw clan install
```


This will run the unit tests of the project and create the jar file.

## 🚀 Usage
[(Back to top)](#table-of-contents)

After having the jar file you can simply run:

```
java -jar target/PunkApi4J-0.0.1-SNAPSHOT.jar
```

Since this is a Spring Boot project, you can also run the project with below command;
```
mvn spring-boot:run
```

or if you don't have installed maven on your OS
```
mvnw spring-boot:run
```

The project will run on port 8080 (configured as default).

## ⚙️ API Example

Main application URL: `http://localhost:8080`

#### Endpoints
* Test                : `GET /v2/test`
* Get Beer with Id    : `GET /v2/beer/{id}`
* Get Beers           : `GET /v2/beers`
* Get Beers with page : `GET /v2/beers/page`
* Get a random beer   : `GET /v2/beers/random`
* Get beer qith query : `GET /v2/beers/query`

```json

[
  {
    "id": 1,
    "name": "Buzz",
    "tagline": "A Real Bitter Experience.",
    "description": "A light, crisp and bitter IPA brewed with English and American hops. A small batch brewed only once.",
    "image_url": "https://images.punkapi.com/v2/keg.png"
  }
]

```

[comment]: <> (## 📆 Release History)

[comment]: <> (* 0.2.1)

[comment]: <> (    * CHANGE: Update docs &#40;module code remains unchanged&#41;)

[comment]: <> (* 0.2.0)

[comment]: <> (    * CHANGE: Remove `setDefaultXYZ&#40;&#41;`)

[comment]: <> (    * ADD: Add `init&#40;&#41;`)

[comment]: <> (* 0.1.1)

[comment]: <> (    * FIX: Crash when calling `baz&#40;&#41;` &#40;Thanks @GenerousContributorName!&#41;)

[comment]: <> (* 0.1.0)

[comment]: <> (    * The first proper release)

[comment]: <> (    * CHANGE: Rename `foo&#40;&#41;` to `bar&#40;&#41;`)

[comment]: <> (* 0.0.1)

[comment]: <> (    * Work in progress)

## 🤝 Contributing
[(Back to top)](#table-of-contents)

1. Fork it (<https://github.com/mGungorr/PunkApi4J>)
2. Create your feature branch (`git checkout -b feature/fooBar`)
3. Commit your changes (`git commit -am 'Add some fooBar'`)
4. Push to the branch (`git push origin feature/fooBar`)
5. Create a new Pull Request

## ⌨️ Author
[(Back to top)](#table-of-contents)

👤 **Mustafa Güngör**

- Github: [@mGungorr](https://github.com/mGungorr)
- Linkedin: [@mGungorr](https://www.linkedin.com/in/mgungorr/)

## 📝 License
[(Back to top)](#table-of-contents)

Copyright © 2021.

This project is [MIT](https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/gittigidiyor-graduation-project-mGungorr/blob/main/LICENSE) licensed.

---

This README was generated with ❤️ 