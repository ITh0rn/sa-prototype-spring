'use strict';
(function testing() {
    const resp = fetch({
        url: 'loclahost:8080/api',
    })
        .then()
        .catch((err) => {
            console.log(err);
            throw err;
        })
})();