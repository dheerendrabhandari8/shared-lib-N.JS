def call(Map stageParams){
    checkout ([
        $class: 'GitSCM',
        branches: [[name: stageParams.branch]],

        userRemoteConfigs: [[credentialsId: '2b4d0ff7-2b8a-42bc-9e50-8e02a10bfaee', url: stageParams.url]]
    ])
}