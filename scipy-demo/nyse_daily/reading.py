import glob
from itertools import chain
from zipfile import ZipFile
import pandas as pd


def read_zip_with_csv(path):
    zip_file = ZipFile(path)
    dfs = [pd.read_csv(zip_file.open(zip_info.filename)) for zip_info in zip_file.infolist()]
    return pd.concat(dfs)


def to_infos_with_file(zip_file):
    return map(lambda zip_info: (zip_file, zip_info), zip_file.infolist())


def read_zips_with_csv(pattern):
    paths = [path for path in glob.glob(pattern)]
    zip_files = [ZipFile(path) for path in paths]
    infos_with_file = [to_infos_with_file(zip_file) for zip_file in zip_files]
    infos_with_file = chain.from_iterable(infos_with_file)
    dfs = [pd.read_csv(zip_file.open(zip_info.filename)) for (zip_file, zip_info) in infos_with_file]
    return pd.concat(dfs)
