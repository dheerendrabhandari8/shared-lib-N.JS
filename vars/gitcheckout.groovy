def call(Map stageParams){
    checkout ([
        $class: 'GitSCM',
        branches: [[name: stageParams.branch]],

        userRemoteConfigs: [[credentialsId: 'gitlab', url: stageParams.url]]
    ])
}
