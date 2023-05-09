def call(Map stageParams){
    checkout ([
        $class: 'GitSCM',
        branches: [[name: stageParams.branch]],

        userRemoteConfigs: [[credentialsId: 'glpat-SGD-hzceVcTfMsTh31qn', url: stageParams.url]]
    ])
}
