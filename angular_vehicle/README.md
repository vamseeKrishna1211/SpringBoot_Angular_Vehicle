# Angular_Vehicle 
This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 6.1.2.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).





#Angular_Vehicle project was generated with [angular-cli]
## Development server
Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. 

#UI Page contains fields to enter vehicle details. we can no.of add vehicles one by one to the table 
displayed on top of page by entering vlaues in feilds displayed under the table and Click on AddVehicle Button.. 

#when click on BatchSubmit records will save to the database though spring back-end code.
#Batch Submit will save only records when all data in batchsubmit having no errors. otherwise it won't persist any data.
#By click the checkbox named "save all records without the one having error", it will save partial records and omit records having errors.

#error data#
length of values in the fields should be 40 or less. otherwise it wont save those records.
and name field must be fill.  