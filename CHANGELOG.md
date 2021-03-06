# Change log

## [1.23.0] - 2020-01-25

### Added

- git: save the list of uncommitted changes as `result.changeList`
variable;

### Changed

- terraform: enable support for the `remote` backend.



## [1.22.0] - 2019-12-06

## Breaking

- msteams: the default parameters name changed from `teamsParams` to
`msteamsParams`.



## [1.21.0] - 2019-12-04

### Added

- new plugin: `tasks/msteams`.

### Changed

- ldap: automatically retry the query in case of errors;
- github: fixed a potential NPE when using the `git` task's `commit`
action and an invalid `baseBranch` value.



## [1.20.0] - 2019-10-30

### Added

- jira: new `debug` option.
- github: new actions `createRepo` and `deleteRepo`.



## [1.19.1] - 2019-10-18

### Changed

- jira: fixed an issue with the `fields` parameter not being passed
correctly.



## [1.19.0] - 2019-10-16

### Added

- jira: new action `getIssues`.



## [1.18.0] - 2019-10-14

### Added

- new plugin: `tasks/s3`;
- new plugin: `tasks/zoom`;
- gremlin: support for attacks on containers;
- jira: new action `addAttachment`;
- jira: authentication using Concord username/password secrets.



## [1.17.0] - 2019-07-27

### Added

- terraform: ability to specify a custom URL for the CLI binary;
- terraform: the CLI binary is no longer packaged into the plugin's
JAR. Instead, the new `DependencyManager` is used to download and
cache the binary. Requires Concord 1.31.0 or higher.

### Changed

- ldap: make `isMemberOf` method public again.



## [1.16.0] - 2019-08-23

### Added

- terraform: support for additional `backend` types.



## [1.15.0] - 2019-08-21

### Added

- new plugin: `tasks/confluence`;
- new plugin: `tasks/puppet`.



## [1.14.2] - 2019-08-08

### Changed

- terraform: fixed the apply's command when `saveOutput` and `dir`
options are used.



## [1.14.1] - 2019-07-31

### Changed

- terraform: the CLI version updated to `0.12.5`.

 

## [1.14.0] - 2019-07-26

### Added

- terraform: support for user supplied var files for `plan` and
`apply` actions;
- git: new `git` task action `pull`.



## [1.13.0] - 2019-07-17

### Added

- git: new `github` task action `deleteBranch`.

### Breaking

- terraform: `dirOrPlan` has been split into two separate
parameters: `dir` and `plan`. When running `apply` with a previously
created file, the `dir` must be specified in cases when the TF files
are located in a subdirectory.



## [1.12.0] - 2019-07-14

### Added

- terraform: new `action: plan` parameter - `destroy: true`. Destroys
managed infrastructure;
- new plugin: `tasks/jsonpath`;
- git: new `github` task action `deleteTag`.

### Changed

- jira: `reporter` value can now be overridden using the
`requestorUid` parameter.



## [1.11.0] - 2019-05-15

### Added

- taurus: new parameter `downloadPlugins`. The task skips downloading
JMeter plugins unless `downloadPlugins` is `true`. This allows for
completely offline work;
- git: new `github` task action `getStatuses`.



## [1.10.0] - 2019-05-09

### Added

- new plugin: `tasks/taurus`.



## [1.9.0] - 2019-04-23

### Added

- git: new GitHub action `getLatestSha`.



## [1.8.0] - 2019-04-18

### Added

- git: new GitHub actions `getBranchList`, `getTagList`.



## [1.7.1] - 2019-04-17

### Changed

- gremlin: add the `X-Gremlin-Agent` header to requests;
- ldap: support for multivalue LDAP attributes when fetching user
details from AD/LDAP.



## [1.7.0] - 2019-04-08

### Added

- github: new action `forkRepo`.



## [1.6.0] - 2019-04-03

### Added

- gremlin: support for `halt` action.



## [1.5.0] - 2019-03-29

### Added

- new plugin: `tasks/gremlin`.



## [1.4.0] - 2019-03-28

### Added

- new plugin: `tasks/jenkins`;
- terraform: support for `terraform output`.



## [1.3.0] - 2019-03-11

### Added

- terraform: Concord secrets and private key files can now be used
for GIT modules auth.

### Changed

- terraform: updated to `0.11.12`.



## [1.2.2] - 2019-03-06

### Changed

- terraform: fix the backend configuration when using a non-default
working directory.



## [1.2.1] - 2019-02-28

### Changed

- terraform: `dirOrPlan` parameter now correctly used to run
`terraform init`.



## [1.2.0] - 2019-02-27

### Added

- new plugin: `tasks/terraform`.



## [1.1.0] - 2019-02-20

### Added

- jira: new action `createSubTask`.

### Changed

- git: minor code cleanup;
- ldap: minor code cleanup.



## [1.0.0] - 2019-02-20

### Added

- git: first public release;
- jira: first public release;
- ldap: first public release.
