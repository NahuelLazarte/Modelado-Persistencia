# Justificación del DER de Tinderizr

## Relaciones many-to-many

- Para los matches, se diseñó una tabla genérica que contempla tanto los matches simples como múltiples. Por ello, en dicha tabla se guarda el ID del dominio, permitiendo acceso al tipo de vinculación y al número mínimo de participantes requerido. La tabla `match_participante` es la que guardará tanto el usuario como el ID del match.
- Para los tags, teniendo en cuenta que ya están precargados, se modeló una tabla `busqueda_tag` donde se relacionarán todos los tags que el usuario seleccione al momento de hacer la búsqueda.

## Relaciones one-to-many

- El usuario tendrá una relación one-to-many tanto para los `likes` como para los `dislikes`.
- El dominio, al ser una generalización para diferentes tipos (es decir, un tipo pertenece a un dominio en particular), se modeló con una relación one-to-many.
- Para los campos variables, se creó una tabla llamada `campo` y se consideró esta relación con dominio como many-to-one porque los campos variables son particulares para cada dominio.