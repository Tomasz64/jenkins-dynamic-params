def params() {
    params = [
        string(
            defaultValue: '',
            description: 'Type of pipeline',
            name: 'TYPE'
        ),
    ]

    if (env.JOB_NAME == 'main-pipeline') {
        params += [
            string(
                defaultValue: '',
                description: "I'm params for master pipeline!"
                name: 'DEPLOY_ARGS'
            ),
        ]
    } else if (env.JOB_NAME == 'validation-pipeline') {
        params += [
            string(
                defaultValue: '',
                description: "I'm params for validation pipeline!"
                name: 'DEPLOY_ARGS'
            ),
        ]
    }

    properties([
        parameters(
            params
        )
    ])
}