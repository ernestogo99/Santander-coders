create view visao_prof as(
	select id_disciplina,ementa
	from disciplinas
)

select * from visao_prof